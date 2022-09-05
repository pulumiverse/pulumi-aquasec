// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec.Outputs
{

    [OutputType]
    public sealed class GetPermissionsSetsPermissionsSetResult
    {
        public readonly ImmutableArray<string> Actions;
        public readonly string Author;
        public readonly string Description;
        public readonly bool IsSuper;
        public readonly string Name;
        public readonly bool UiAccess;
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetPermissionsSetsPermissionsSetResult(
            ImmutableArray<string> actions,

            string author,

            string description,

            bool isSuper,

            string name,

            bool uiAccess,

            string updatedAt)
        {
            Actions = actions;
            Author = author;
            Description = description;
            IsSuper = isSuper;
            Name = name;
            UiAccess = uiAccess;
            UpdatedAt = updatedAt;
        }
    }
}
