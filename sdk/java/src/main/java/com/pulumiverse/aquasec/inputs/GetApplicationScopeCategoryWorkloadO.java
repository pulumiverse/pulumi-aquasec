// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumiverse.aquasec.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumiverse.aquasec.inputs.GetApplicationScopeCategoryWorkloadOVariable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationScopeCategoryWorkloadO extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationScopeCategoryWorkloadO Empty = new GetApplicationScopeCategoryWorkloadO();

    @Import(name="expression", required=true)
    private String expression;

    public String expression() {
        return this.expression;
    }

    @Import(name="variables")
    private @Nullable List<GetApplicationScopeCategoryWorkloadOVariable> variables;

    public Optional<List<GetApplicationScopeCategoryWorkloadOVariable>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private GetApplicationScopeCategoryWorkloadO() {}

    private GetApplicationScopeCategoryWorkloadO(GetApplicationScopeCategoryWorkloadO $) {
        this.expression = $.expression;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationScopeCategoryWorkloadO defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationScopeCategoryWorkloadO $;

        public Builder() {
            $ = new GetApplicationScopeCategoryWorkloadO();
        }

        public Builder(GetApplicationScopeCategoryWorkloadO defaults) {
            $ = new GetApplicationScopeCategoryWorkloadO(Objects.requireNonNull(defaults));
        }

        public Builder expression(String expression) {
            $.expression = expression;
            return this;
        }

        public Builder variables(@Nullable List<GetApplicationScopeCategoryWorkloadOVariable> variables) {
            $.variables = variables;
            return this;
        }

        public Builder variables(GetApplicationScopeCategoryWorkloadOVariable... variables) {
            return variables(List.of(variables));
        }

        public GetApplicationScopeCategoryWorkloadO build() {
            $.expression = Objects.requireNonNull($.expression, "expected parameter 'expression' to be non-null");
            return $;
        }
    }

}
