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
    public sealed class VmwareAssurancePolicyCustomCheck
    {
        /// <summary>
        /// Name of user account that created the policy.
        /// </summary>
        public readonly string? Author;
        public readonly string? Description;
        public readonly string? Engine;
        public readonly int? LastModified;
        public readonly string? Name;
        public readonly string? Path;
        public readonly bool? ReadOnly;
        public readonly string? ScriptId;
        public readonly string? Severity;
        public readonly string? Snippet;

        [OutputConstructor]
        private VmwareAssurancePolicyCustomCheck(
            string? author,

            string? description,

            string? engine,

            int? lastModified,

            string? name,

            string? path,

            bool? readOnly,

            string? scriptId,

            string? severity,

            string? snippet)
        {
            Author = author;
            Description = description;
            Engine = engine;
            LastModified = lastModified;
            Name = name;
            Path = path;
            ReadOnly = readOnly;
            ScriptId = scriptId;
            Severity = severity;
            Snippet = snippet;
        }
    }
}
